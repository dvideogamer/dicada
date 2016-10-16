(function() {
    'use strict';

    angular
        .module('app.income')
        .factory('incomeFactory', incomeFactory);

    incomeFactory.$inject = ['$http'];

    function incomeFactory($http) {
        var service = {
            saveOneTimeIncome: saveOneTimeIncome,
            retrieveOneTimeIncome: retrieveOneTimeIncome
        };

        return service

        function saveOneTimeIncome(incomeObject){
            var method = incomeObject.id ? 'PUT' : 'POST';

            return $http[method]('/oneTimeIncome', incomeObject)
                    .then(successCallback)
                    .catch(failureCallback)

            function successCallback(response) {
                return response.data.data;
            }

            function failureCallback(error) {
                logger.error('XHR Failed for getAvengers.' + error.data);
            }
        };

        function retrieveOneTimeIncome(){
            return $http.get('/oneTimeIncome')
                    .then(successCallback)
                    .catch(failureCallback)

            function successCallback(response) {
                return response.data.data;
            }

            function failureCallback(error) {
                logger.error('XHR Failed for getAvengers.' + error.data);
            }

        };
    }
})();