<!DOCTYPE html>
       <html>
       <head>
            <style>
                .main {
                    font-weight: bold;
                    font-size: xx-medium;
                    background-color: tomato;
                }

                .table{
                    color: blue;
                    background-color: yellow;
                }
            </style>


           <title>Countries</title>
           <meta charset="UTF-8">
           <meta name="viewport" content="width=device-width, initial-scale=1.0">
       </head>
       <body>
       <h2>List of Cities</h2>

       <div>
       <a href="/add-country"> <img src="images/add.png" width="62" height="62"/> </a>
       </div>

        <div class="main">
               <a href="/">Back</a>
        </div>
       <table class="table">
           <tr>
               <th>Name</th>
           </tr>

           <#list cities as city>
               <tr>

               </tr>
           </#list>
       </table>
       </body>
       </html>