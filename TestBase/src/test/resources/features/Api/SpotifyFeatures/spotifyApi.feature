Feature: User Login

  Scenario Outline: <testID> - With token - With permissions
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>" to the default playlist
    And the last response is "200"
    And the track "<trackId>" is added to the default playlist
    Examples:
      | testId | trackId |
      | 0000   | track1  |
      | 0000   | track2  |
      | 0000   | track3  |

  Scenario Outline: <testID> - With token - Without permissions
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>" to the default playlist
    And the last response is "403"
    Examples:
      | testId | trackId |
      | 0000   | track1  |
      | 0000   | track2  |
      | 0000   | track3  |

  Scenario Outline: <testID> - Without token
    And the user adds the track "<trackId>" to the default playlist
    And the last response is "401"
    Examples:
      | testId | trackId |
      | 0000   | track1  |
      | 0000   | track2  |
      | 0000   | track3  |

  Scenario Outline: <testID> - With expired token
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the token is set to be expired
    And the user adds the track "<trackId>" to the default playlist
    And the last response is "401"
    Examples:
      | testId | trackId |
      | 0000   | track1  |
      | 0000   | track2  |
      | 0000   | track3  |

  Scenario Outline: <testID> - Add theme to a different playlist
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>" to the "<playlistId>" playlist
    And the last response is "200"
    And the track "<trackId>" is added to the "<playlistId>" playlist
    Examples:
      | testId | trackId | playlistId  |
      | 0000   | track1  | playlistId1 |
      | 0000   | track2  | playlistId2 |
      | 0000   | track3  | playlistId3 |

  Scenario Outline: <testID> - Add different themes to the same playlist
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>" to the default playlist
    And the last response is "200"
    And the user adds the track "<trackId2>" to the default playlist
    And the last response is "200"
    And the user adds the track "<trackId3>" to the default playlist
    And the last response is "200"
    And the track "<trackId>" is added to the "<playlistId>" playlist
    And the track "<trackId2>" is added to the "<playlistId>" playlist
    And the track "<trackId3>" is added to the "<playlistId>" playlist
    Examples:
      | testId | trackId | trackId2 | trackId3 |
      | 0000   | track1  | track3   | track2   |
      | 0000   | track2  | track1   | track3   |
      | 0000   | track3  | track2   | track1   |

  Scenario Outline: <testID> - Add multiple themes to the same playlist
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>-<trackId2>-<trackId3>" to the default playlist
    And the last response is "200"
    And the track "<trackId>" is added to the "<playlistId>" playlist
    And the track "<trackId2>" is added to the "<playlistId>" playlist
    And the track "<trackId3>" is added to the "<playlistId>" playlist
    Examples:
      | testId | trackId | trackId2 | trackId3 |
      | 0000   | track1  | track3   | track2   |
      | 0000   | track2  | track1   | track3   |
      | 0000   | track3  | track2   | track1   |

  Scenario Outline: <testID> - Add multiple themes to the same playlist
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>-<trackId2>-<trackId3>" to the default playlist
    And the last response is "200"
    And the track "<trackId>" is added to the "<playlistId>" playlist
    And the track "<trackId2>" is added to the "<playlistId>" playlist
    And the track "<trackId3>" is added to the "<playlistId>" playlist
    Examples:
      | testId | trackId | trackId2 | trackId3 |
      | 0000   | track1  | track3   | track2   |
      | 0000   | track2  | track1   | track3   |
      | 0000   | track3  | track2   | track1   |

  Scenario Outline: <testID> - Invalid song ID
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>" to the default playlist
    And the last response is "403"
    Examples:
      | testId | invalidTrackId  |
      | 0000   | invalidTrackId1 |
      | 0000   | invalidTrackId2 |
      | 0000   | invalidTrackId3 |

  Scenario Outline: <testID> - Invalid playlist ID
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>" to the "playlistId" playlist
    And the last response is "403"
    Examples:
      | testId | trackId | invalidPlaylistId  |
      | 0000   | track1  | invalidPlaylistId1 |
      | 0000   | track2  | invalidPlaylistId2 |
      | 0000   | track3  | invalidPlaylistId3 |

  Scenario Outline: <testID> - ¿Empty ID?
    Given that the user initiates the Get Token request
    And the last response is "200"
    And the user adds the track "<trackId>" to an empty playlist ID
    And the last response is "403"
    And the user adds an empty track to the default playlist
    And the last response is "403"
    Examples:
      | testId | trackId |
      | 0000   | track1  |
      | 0000   | track2  |
      | 0000   | track3  |