//导航页controller
indexApp.controller("mainCtrl",['$scope',function($scope){
	$('.left-main').show();
	$('.right-main').show();
	$('.left-forward').show();
	$('.right-forward').show();
	$('.bottom-navigation').show();
	if(first_load){
		$scope.pageClass = 'page-main';
		first_load=false;
	}else{
		$scope.pageClass = 'page-main page-down';
	}
}]);