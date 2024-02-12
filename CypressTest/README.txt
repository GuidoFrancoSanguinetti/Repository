I forgot to do it in gherkin, working on it right now, should be done in a little bit.


You will see a base project on the repository for Java. I had to clean it up since I think some sort of virus got into my pc and didn't want to take any chances.
Therefore it's a little empty and raw. But you can still check it out if you want.

First time using cypress. I'm more of a Selenium + Java user so don't look too much into it.

Was confused if what you wanted was full on testing or just specifically what was asked for. Did the second one.
I also skipped checking all the information in every single screen as well as the last screen to be redirected to after each test case.
I understand this should be done in a work environment but deemed it unnecessary for the test at hand.

Run into some issues with "type" so switched to "invoke".
Run into some issues with the logout being too fast so added "be.visible".
Found irregular writting on the response when using assert, requires further investigating from me.



2) Explain the process and principles you’ve chosen since the very beginning.

I believe I already talked about this, I'm unsure if I should add anything else.

3) What kind of things do you have to take into account more carefully in every test (BE
and FE possible issues, validations, possible external services needed)

In here I'm only checking the front of the web application, I should have tests checking every webservices used, including databases and permissions. Maybe even some performance test
These 3 tests were just the once given in the exercise but a dozen more should be done for each case. For example I did no negative cases neither did
I check the information given by the app or written by the user.

4) In which stage of the SDLC do you think these tests could help more?

I believe they are the most helpful during the development of the app or the refinement/design of the US in a TDD environment, though it might be hard to create all cases 
if the information is not precise and at hand.

5) Do you have experience with component testing in isolation? How would you apply
component testing in SDLC?

I've honestly done more component testing than E2E testing I believe. You apply it the same way but separate modules trying to make them independent from each other.
Sometimes Mocks can be a great help. Also, database access and omnipotent users. Having a QA Environment separate from Development is a must for this to work.