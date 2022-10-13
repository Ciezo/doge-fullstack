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
       <h2>List of Countries</h2>

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

           <#list countries as country>
               <tr>
                   <td>${country.name}</td>
                   <td><a href="/show-country/${country.id}"> <img src="images/view.png" width="25" height="25"/>  </a> </td>
                   <td><a href="/update-country/${country.id}"> <img src="images/edit.png" width="25" height="25"/>  </a> </td>
                   <td><a href="/delete/${country.id}"><img src="images/delete.png" width="25" height="25"/>  </a> </td>
                   <td><a href="/cities/${country.id}"><img src="images/cities.png" width="25" height="25"/>  </a> </td>
               </tr>
           </#list>
       </table>
       </body>
       </html>