//

function getXHR()
{
	var xmlHttp;
	 
	 try
	    {
	   // Firefox, Opera 8.0+, Safari
	    xmlHttp=new XMLHttpRequest();
	    }
	 catch (e)
	    {

	  // Internet Explorer
	   try
	      {
	      xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
	      }
	   catch (e)
	      {

	      try
	         {
	         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
	         }
	      catch (e)
	         {
	         alert("所有的");
	         return false;
	         }
	      }
	    }

	 return xmlHttp;
	
}