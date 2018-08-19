(function($,window){
	login = {};
	login.init = function(){
		//初始化按钮
		login.initButton();
	};
	login.initButton = function(){
	    //登录
	    $('#loginBtn').bind('click',function(){
	        alert('1');
	    });
	};
})(jQuery,this);
$(function(){
	login.init();
});