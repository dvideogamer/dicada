(function() {
    'use strict';

    angular
        .module('app.income', ['ui.router'])
        .config( function($stateProvider, $urlRouterProvider) {

            $urlRouterProvider.otherwise('/');

            $stateProvider
            // HOME STATES AND NESTED VIEWS ========================================
            .state('oneTimeIncomeList', {
                url: '/oneTimeIncomeList',
               templateUrl: 'module/app/one-time-income-list.html'
            })

            // ABOUT PAGE AND MULTIPLE NAMED VIEWS =================================
            .state('about', {
                // we'll get to this in a bit
            });
        });
})();