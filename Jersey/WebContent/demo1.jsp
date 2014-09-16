<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
  <head>
   <script src="js/jquery-1.10.2.js"></script>
   
   <script>
   		function test(){
   			$.ajax({
			type: 'GET',
			//url: 'services/helloWorld/doGet2',
			url: 'rest/hello/sayHello',
			dataType: "json",
            contentType: "application/json",         
           // data:  "{\"name\":\"zhangsan\"}",
            data:"",
			cache : false,
			error:function(){alert('系统连接失败，请稍后再试！')},
			success: function(obj)
			{	
				alert(obj.name);
			},
			xhrFields: {
			      withCredentials: true
			   }
		});
   		}
   </script>
   
   <script>
   		function rest(){
   			$.ajax({
			type: 'POST',
			//url: 'services/helloWorld/doGet2',
			url: 'services/helloWorld/test1019',
			dataType: "json",
            contentType: "application/json",
          //  data: "{\"name\":\"zhangsan\",\"age\":28,\"address\":\"beijing\",\"tel\":\"01082658866\"}",
            data:  "{\"name\":\"zhangsan\"}",
			cache : false,
			error:function(){alert('系统连接失败，请稍后再试！')},
			success: function(obj){	
				alert(obj.name);
			}	  
		});
   		}
   </script>
   
    <script>
   		function rest2(){
   			$.ajax({
			type: 'POST',
			//url: 'services/helloWorld/doGet2',
			url: 'services/helloWorld/test1020',
			dataType: "json",
            contentType: "application/json",
          //  data: "{\"name\":\"zhangsan\",\"age\":28,\"address\":\"beijing\",\"tel\":\"01082658866\"}",
            data:  {
              		"j":"{\"name\":\"zhangsan\"}"
          			}	,
			cache : false,
			error:function(){alert('系统连接失败，请稍后再试！')},
			success: function(obj){	
				alert(obj.name);
			}	  
		});
   		}
   </script>
   
    <script>
   		function rest3(){
   			$.ajax({
			type: 'POST',
			//url: 'services/helloWorld/doGet2',
			url: 'services/helloWorld/delete/10',
			dataType: "json",
            contentType: "application/json",
          //  data: "{\"name\":\"zhangsan\",\"age\":28,\"address\":\"beijing\",\"tel\":\"01082658866\"}",
            data:  {
              		"j":"{\"name\":\"zhangsan\"}"
          			}	,
			cache : false,
			error:function(){alert('系统连接失败，请稍后再试！')},
			success: function(obj){	
				alert(obj.name);
			}	  
		});
   		}
   </script>
  </head>
  
  <body>
    <button onclick="test()">hello</button>
    <button onclick="rest()">Button2</button>
    <button onclick="rest2()">Button3</button>
    <button onclick="rest3()">Button4</button>
  </body>
</html>
