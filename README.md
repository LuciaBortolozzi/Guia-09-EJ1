# Guia-09-EJ1
Ejercicio Nro.1 – Flota de vehículos

La gerencia de logística de una empresa solicita el desarrollo de una aplicación JAVA con OO y MVC para la administración de su flota de vehículos.

La gerencia guarda los datos de los autos, todos con antigüedad no mayor a 6 años, en un archivo llamado Autos.txt, de ancho fijo, con la patente, marca, modelo, año de patentamiento, precio de compra, tipo de combustible (nafta o diésel) y si tiene equipo multimedia, aire acondicionado y/o gps.

En otro archivo, Mantenimientos.txt, guarda los controles preventivos y las reparaciones realizadas en los vehículos con la información separada por “;” (punto y coma). Este archivo contiene: patente, tipo de mantenimiento (control preventivo o reparación), fecha (yyyymmdd) y costo. Si se trata de una reparación, además incluye un comentario con las partes del vehículo que fueron reparadas y el costo correspondiente.
Por último, cuenta con otros dos archivos, cuya información está separada por TAB. Uno con la nómina de marcas de automóviles del mercado (código y descripción) y otro con los modelos de las mismas, formado por el código de la marca y código del modelo y descripción del mismo. 

Se pide:

a) Desarrollar una pantalla gráfica para el ingreso de la información de los autos, considerando que la patente debe responder al formato válido, según el año de patentamiento. Los modelos de los vehículos dependen de la marca indicada. Una vez que el usuario finaliza el ingreso, los datos deberán ser almacenados en el archivo correspondiente. La pantalla debe permitir, también, la cancelación de la información ingresada, previa confirmación del usuario.

b) Desarrollar otra pantalla gráfica para el ingreso de la información del mantenimiento de los autos, considerando que la fecha del mantenimiento es la fecha del sistema. Una vez que el usuario finaliza el ingreso, los datos deberán ser almacenados en el archivo correspondiente. 

c) Desarrollar una tercera pantalla gráfica para la consulta de los datos completos de un automóvil a partir del ingreso de la patente. La consulta, también tiene que incluir el costo total del vehículo (precio de compra más los mantenimientos) y los datos del mantenimiento de mayor importe.

d) Incluir las tres pantallas desarrolladas en un menú de opciones, junto con otra dos. Una que brinde información sobre la versión el programa y otra que sirva para finalizar su ejecución. Esta última, incluirla en la barra principal del menú.
