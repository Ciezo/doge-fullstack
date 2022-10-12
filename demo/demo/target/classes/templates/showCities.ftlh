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

                .content-table-city {
                  border-collapse: collapse;
                  margin: auto;
                  font-size: 0.9em;
                  min-width: 700px;
                  border-radius: 5px 5px 0 0;
                  overflow: hidden;
                  box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
                }

                .content-table-city thead tr {
                  background-color: #88D498;
                  color: #C6DABF;
                  text-align: left;
                  font-weight: bold;
                }

                .content-table-city th,
                .content-table-city td {
                  padding: 12px 20px;
                }

                .content-table-city tbody tr {
                  cursor: pointer;
                  border-bottom: 1px solid #dddddd;
                }

                .content-table-city tbody tr:nth-of-type(even) {
                  background-color: #1A936F;
                }

                .content-table-city tbody tr:nth-of-type(odd) {
                  background-color: #88D498;
                }

                .content-table-city tbody tr:last-of-type {
                  border-bottom: 2px solid #009879;
                }

                .content-table-city tbody tr.active-row {
                  font-weight: bold;
                  color: #009879;
                }

                .Header {
                    background-color: #FCBF49
                }

                .bg {
                  background-image:url('http://wallpaperset.com/w/full/c/f/a/498657.jpg');
                  background-size:cover;
                  background-position:center;
                  height:120vh;
                  display:flex;
                  flex-direction:column;
                  align-items:center;
                  text-align:center;
                  padding:0 20px;
                }
            </style>


           <title>Cities</title>
           <meta charset="UTF-8">
           <meta name="viewport" content="width=device-width, initial-scale=1.0">
       </head>
       <body>
       <div class = "bg">
       <div class = "Header">
           <center>
                <h2>List of Cities</h2>
           </center>
       </div>
        <div class="main">
               <a href="/">Back</a>
        </div>
        <table class="content-table-city">
            <tr>
                <th>ID</th>
                <th>Country</th>
                <th>Name</th>
                <th>Population</th>
                <th>Mayor</th>
            </tr>
            <#list cities as city>
                <tr onclick = "window.location='/countries';">
                    <td>${city.id}</td>
                    <td>${city.country}</td>
                    <td>${city.name}</td>
                    <td>${city.population}</td>
                    <td>${city.mayor}</td>
                </tr>
          </#list>
        </table>
        </div>
    </body>
</html>