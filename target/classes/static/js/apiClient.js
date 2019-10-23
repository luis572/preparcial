const Url = 'http://localhost:8080/airports/';
apiclient = (function () {
  var f = []
  return {
    getAirports: function (name, callback) {
        $.ajax({
				method: "GET",
				contentType: "application/json",
				url: "http://localhost:8080/airports/" + name,
				success: function (respuesta) {
					callback(respuesta)
				},
				error: function () {
					console.log("No se ha podido obtener la información");
				}
			});
      
    }
  };

})();