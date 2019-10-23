app = (function () {
    // PROMESAS DEL REGISTRO
    var email; 
    var onSucessGetAirport = function (data) {
        console.log(JSON.parse(data))
        alert("Ha sido registrado exitosamente");
    }
    var onErrorGetAirport=function (data) {
        console.log($('#city').val())
        alert("La Ciudad Solicitada no se encuentra");
    }

    return {
        /*
            FUNCIONES DE LOGIN
        */
       getAirports:function (name){
        
        return apiclient.getAirports($('#city').val(), onSucessGetAirport);
    },
       
    }
})();