<!DOCTYPE html>
       <html>
       <head>
            <style>
                .main {
                    font-weight: bold;
                    font-size: xx-large;
                    background-color: #D62828;
                }

                * {
                  padding: 0;
                  margin: 0;
                  font-family: sans-serif;
                }

                .content-table-country {
                  border-collapse: collapse;
                  margin: auto;
                  font-size: 0.9em;
                  min-width: 700px;
                  border-radius: 5px 5px 0 0;
                  overflow: hidden;
                  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
                }

                .content-table-country thead tr {
                  background-color: #88D498;
                  color: #C6DABF;
                  text-align: left;
                  font-weight: bold;
                }

                .content-table-country th,
                .content-table-country td {
                  padding: 12px 20px;
                }

                .content-table-country tbody tr {
                  cursor: pointer;
                  border-bottom: 1px solid #dddddd;
                }

                .content-table-country tbody tr:nth-of-type(even) {
                  background-color: #1A936F;
                }

                .content-table-country tbody tr:nth-of-type(odd) {
                  background-color: #88D498;
                }

                .content-table-country tbody tr:last-of-type {
                  border-bottom: 2px solid #009879;
                }

                .content-table-country tbody tr.active-row {
                  font-weight: bold;
                  color: #009879;
                }

                .Header {
                    background-color: #FCBF49
                }

                .bg {
                  background-image:url('https://i.pinimg.com/originals/35/e1/39/35e1392fd20ef040791054751eaf6ced.jpg');
                  background-size:cover;
                  background-position:center;
                  height:100vh;
                  display:flex;
                  flex-direction:column;
                  align-items:center;
                  text-align:center;
                  padding:0 20px;
                }
            </style>


           <title>Countries</title>
           <meta charset="UTF-8">
           <meta name="viewport" content="width=device-width, initial-scale=1.0">
       </head>
       <body>
       <div class = "bg">
       <div class = "Header">
           <center>
                <h2>List of Countries</h2>
           </center>
       </div>
        <div class="main">
               <a href="/cities">Back</a>
        </div>
        <table class="content-table-country">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Language</th>
            </tr>
            <#list countries as country>
                <tr onclick = "window.location='/cities';">
                    <td>${country.id}</td>
                    <td>${country.name}</td>
                    <td>${country.language}</td>
                </tr>
          </#list>
        </table>
        </div>
    </body>
</html>