console.log("Generando tabla...");
//generarTabla();
function generarTabla() {
    
    var table = document.getElementsByTagName("table");
    table = table[0];
    table.innerHTML = "<caption>Lista de vainas</caption>";
    var nombrePrecio = "Precio vaina";
    table.innerHTML += `
<thead>
    <tr><th>Tipo</th>
        <th>Nombre</th>
        <th>${nombrePrecio}</th>
    </tr>
</thead>`;
    var lista = new Array();    // Es ignorado por la siguiente línea
    // Así se hace un array de 2 dimensiones
    lista =[ ["Vaina:", "Peine", "15 €"] ];
    lista[1] = ["Vaina:", "Quitapelos", "30 €"];
    lista[2] = ["Vaina:", "Coche", "200 €"];
    
    for (var i = 0; i < lista.length; i++) {
        var nodoTR = document.createElement("tr");
        table.appendChild(nodoTR);
        for (var columna of lista[i] ) {
            var nodoCol = document.createElement("td");
            nodoTR.appendChild(nodoCol);
            var textoCol = document.createTextNode(columna);
            nodoCol.appendChild(textoCol);
        }
    }
}


function recoger(){
    
    var nick = document.getElementById("nick").value;
    var edad = document.getElementById("edad").value;
    var ciudad = document.getElementById("ciudad").value;
    var precio = document.getElementById("precio").value;
    
    var datosFila = [nick, edad, ciudad, precio];
    // añadimos los campos
    //lista[lista.length] = [nick, edad, ciudad, precio];
    lista.push([nick, edad, ciudad, precio]) ;
    //LLAMAMOS A LA FUNCION
    generarTabla();
}
