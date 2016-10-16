(function() {
    'use strict';

    angular
        .module('app', ['ui.router', 'app.income'])
         .config( function($stateProvider, $urlRouterProvider) {
             $urlRouterProvider.otherwise('/');
         });

})();