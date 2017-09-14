<%-- 
    Document   : lab3
    Created on : Sep 13, 2017, 10:45:53 PM
    Author     : Roshan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="stylesheet.css" >

        <title>JSP Page</title>
    </head>
    <body>
        <div class="outerdiv">
            <div class="innerdiv">
                <h1>Rectangle Calculator</h1>
                <img src="images/rectangle.jpeg" border="7">

                <form name="frmRec" method="POST" action="calculator?calType=Rec">
                    <div>
                        <input type="hidden" name="destination" value="lab3">
                        Enter Rectangle length: <input type="text" name="length" value="0"><br><br>
                        Enter Rectangle  width: <input type="text" name="width" value="0"><br>
                    <p>Click the <input type="submit" value="Submit"> button to calculate area :</p>

                    </div>
                </form>

                <p> Rectangle Area is : ${recArea}  </p>

            </div>

            <div class="innerdiv">
                <h1>Circle Calculator</h1>
                <img src="images/circle.gif" border="7">

                <form name="frmCir" method="POST" action="calculator?calType=Cir">
                    <div style="border:5px;">
                        <input type="hidden" name="destination" value="lab3">
                        Enter Radius : <input type="text" name="radius" value="0.0"><br><br>

                    <p>Click the <input type="submit" value="Submit"> button to calculate area :</p>

                    </div>
                </form>

                <p> Area of Circle is : ${cirArea}  </p>
            </div>

            <div class="innerdiv">
                <h1>Triangle Calculator</h1>
                <img src="images/triangle.jpg" border="7">

                <form name="frmTri" method="POST" action="calculator?calType=Tri">
                    <div style="border:5px;">
                        <input type="hidden" name="destination" value="lab3">
                        Enter Rectangle length: <input type="text" name="length1" value="0.0"><br><br>
                        Enter Rectangle  width: <input type="text" name="length2" value="0.0"><br>
                    <p>Click the <input type="submit" value="Submit"> button to calculate area :</p>

                    </div>
                </form>

                <p> Hypotenuse side is : ${triHypotenuse}  </p>
            </div>
        </div>
        
    </body>
</html>
