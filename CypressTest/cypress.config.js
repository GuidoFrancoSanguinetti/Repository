const { defineConfig } = require('cypress');
const { createBundler } = require('@bahmutov/cypress-esbuild-preprocessor');
const { addCucumberPreprocessorPlugin } = require('@badeball/cypress-cucumber-preprocessor');
const browserify = require('@badeball/cypress-cucumber-preprocessor/browserify');
const cucumber = require('cypress-cucumber-preprocessor').default

module.exports = defineConfig({'cypress-cucumber-preprocessor': {
  nonGlobalStepDefinitions: true,
  step_definitions: './cypress/e2e/Login/',
  },
  e2e: {
    setupNodeEvents(on, config) {
      // implement node event listeners here
      on('file:preprocessor', createBundler({
        plugins: [browserify.default(config)],
      }));
      on('file:preprocessor', cucumber())
      return require('./cypress/plugins/index.js')(on, config)
    },
    specPattern: "cypress/e2e/*.feature",
    supportFile:false
  },
});
