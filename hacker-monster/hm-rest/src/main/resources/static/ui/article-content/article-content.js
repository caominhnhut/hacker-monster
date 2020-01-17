angular.module('myApp.articleContent', ['ngRoute'])

.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/article-content', {
    templateUrl: 'ui/article-content/article-content.html',
    controller: 'ArticleContentCtrl'
  });
}])

.controller('ArticleContentCtrl', ['$scope', '$rootScope', '$http', '$location',
  function($scope, $rootScope, $http, $location){
    $scope.message = "this is stories page";
  }]);