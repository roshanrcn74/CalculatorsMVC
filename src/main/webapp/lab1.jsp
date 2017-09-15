<%-- 
    Document   : lab1
    Created on : Sep 12, 2017, 9:02:21 PM
    Author     : Roshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stylesheet.css">
    
        <title></title>
    </head>
    <body>
        <div class="outerdiv">
            <div class="innerdiv">
            <h1>Rectangle Calculator </h1>
            <img src="images/rectangle.jpeg" border="7" aline="middle">

            <form name="frmLab1" method="POST" action="calculator?calType=Rec">
                
                    <input type="hidden" name="destination" value="result">
                    Enter Rectangle length: <input type="text" name="length" value="0"><br><br>
                    Enter Rectangle  width: <input type="text" name="width" value="0"><br>
                <p>Click the <input type="submit" value="Submit"> button to calculate area :</p>

                
            </form>

            <p> Rectangle Area is : ${recArea}  </p>
            </div>
        </div>
    </body>
</html>
