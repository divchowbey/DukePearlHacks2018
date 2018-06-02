'use strict';
module.exports = function (app) {

    app.get('/', (req, res) =>{res.render("index");} );
    
    app.get('/getCountryData', (req, res) =>{
        // 
        var request = require("request");

        var options = {
            method: 'GET',
            url: 'https://www.forbes.com/ajax/list/data',
            qs: { year: '2017', uri: 'global2000', type: 'organization' },
            headers:
                {
                    'Postman-Token': 'aca21afa-d54d-c1f7-63d6-571db7aa0ca3',
                    'Cache-Control': 'no-cache'
                }
        };


        request(options, function (error, response, body) {
            if (error) throw new Error(error);

            console.log(body);
            res.send(body);
        });

    });
};
