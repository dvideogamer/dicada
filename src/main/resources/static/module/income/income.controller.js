(function() {
    'use strict';

    angular
        .module('app.income')
        .controller('IncomeController', IncomeController);

    IncomeController.$inject = ['incomeFactory']
    function IncomeController(incomeFactory) {

    }

})();