/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema14.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConexionBase {
// Configuración de la conexión a la base de datos MySQL
            String url = "jdbc:mysql://localhost:3306/practica_intermodular";
            String usuario = "root";
            String contraseña = "Med@c";
// Sentencias SQL
            String sqlMartes = "SELECT * FROM Planeta where nombre = 'Marte'";
            String sqlTierra = "SELECT * FROM Planeta where nombre = 'Tierra'";
            String sqlVenus = "SELECT * FROM Planeta where nombre = 'Venus'";
            String sqlMercurio = "SELECT * FROM Planeta where nombre = 'Mercurio'";
            String sqlJupiter = "SELECT * FROM Planeta where nombre = 'Jupiter'";
            String sqlSaturno = "SELECT * FROM Planeta where nombre = 'Saturno'";
            String sqlUrano = "SELECT * FROM Planeta where nombre = 'Urano'";
            String sqlNeptuno = "SELECT * FROM Planeta where nombre = 'Neptuno'";
            String sqlFobos = "SELECT * FROM Satelite where nombre = 'Fobos'";
            String sqlDeimos = "SELECT * FROM Satelite where nombre = 'Deimos'";
            String sqlLuna = "SELECT * FROM Satelite where nombre = 'Luna'";
            String sqlIo = "SELECT * FROM Satelite where nombre = 'Io'";
            String sqlEuropa = "SELECT * FROM Satelite where nombre = 'Europa'";
            String sqlGanimedes = "SELECT * FROM Satelite where nombre = 'Ganimedes'";
            String sqlCalisto = "SELECT * FROM Satelite where nombre = 'Calisto'";
            String sqlTitan = "SELECT * FROM Satelite where nombre = 'Titan'";
            String sqlEncelado = "SELECT * FROM Satelite where nombre = 'Encelado'";
            String sqlTitania = "SELECT * FROM Satelite where nombre = 'Titania'";
            String sqlOberon = "SELECT * FROM Satelite where nombre = 'Oberon'";
            public String [] conectarConsultarMarte(){
             //Craer array
             String[] datosMarte = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlMartes);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosMarte[0] = resultados.getString("radio");
                    datosMarte[1] = resultados.getString("distancia_estrella");
                    datosMarte[2] = resultados.getString("nombre");
                    datosMarte[3] = resultados.getString("masa");
                    datosMarte[4] = resultados.getString("tipo");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosMarte;

             }
                    
                
 public String [] conectarConsultarTierra(){
      String[] datosTierra = new String[7];
      try{
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlTierra);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosTierra[0] = resultados.getString("radio");
                    datosTierra[1] = resultados.getString("distancia_estrella");
                    datosTierra[2] = resultados.getString("nombre");
                    datosTierra[3] = resultados.getString("masa");
                    datosTierra[4] = resultados.getString("tipo");
                    datosTierra[5] = resultados.getString("id_estrella");
                    
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosTierra;

 }
  public String [] conectarConsultarVenus(){
      String[] datosVenus = new String[7];
      try{
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlVenus);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                   datosVenus[0] = resultados.getString("radio");
                    datosVenus[1] = resultados.getString("distancia_estrella");
                    datosVenus[2] = resultados.getString("nombre");
                   datosVenus[3] = resultados.getString("masa");
                    datosVenus[4] = resultados.getString("tipo");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosVenus;

             }
   public String [] conectarConsultarMercurio(){
      String[] datosMercurio = new String[7];
      try{
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlMercurio);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                  datosMercurio[0] = resultados.getString("radio");
                    datosMercurio[1] = resultados.getString("distancia_estrella");
                    datosMercurio[2] = resultados.getString("nombre");
                  datosMercurio[3] = resultados.getString("masa");
                    datosMercurio[4] = resultados.getString("tipo");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosMercurio;

             }
  public String [] conectarConsultarJupiter(){
      String[] datosJupiter = new String[7];
      try{
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlJupiter);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                 datosJupiter[0] = resultados.getString("radio");
                 datosJupiter[1] = resultados.getString("distancia_estrella");
                 datosJupiter[2] = resultados.getString("nombre");
                 datosJupiter[3] = resultados.getString("masa");
                 datosJupiter[4] = resultados.getString("tipo");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosJupiter;

             }
   public String [] conectarConsultarSaturno(){
      String[] datosSaturno = new String[7];
      try{
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlSaturno);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                 datosSaturno[0] = resultados.getString("radio");
                  datosSaturno[1] = resultados.getString("distancia_estrella");
                  datosSaturno[2] = resultados.getString("nombre");
                 datosSaturno[3] = resultados.getString("masa");
                  datosSaturno[4] = resultados.getString("tipo");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return  datosSaturno;

             }
     public String [] conectarConsultarUrano(){
      String[] datosUrano = new String[7];
      try{
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlUrano);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                 datosUrano[0] = resultados.getString("radio");
                  datosUrano[1] = resultados.getString("distancia_estrella");
                  datosUrano[2] = resultados.getString("nombre");
                datosUrano[3] = resultados.getString("masa");
                  datosUrano[4] = resultados.getString("tipo");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return  datosUrano;

             }
    public String [] conectarConsultarNeptuno(){
      String[] datosNeptuno = new String[7];
      try{
      Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlNeptuno);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                 datosNeptuno[0] = resultados.getString("radio");
                 datosNeptuno[1] = resultados.getString("distancia_estrella");
                  datosNeptuno[2] = resultados.getString("nombre");
                datosNeptuno[3] = resultados.getString("masa");
                  datosNeptuno[4] = resultados.getString("tipo");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return  datosNeptuno;

             }
  public String [] conectarConsultarFobos(){
             //Craer array
             String[] datosFobos = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlFobos);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosFobos[0] = resultados.getString("radio");
                    datosFobos[1] = resultados.getString("id_planeta");
                    datosFobos[2] = resultados.getString("nombre");
                    datosFobos[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosFobos;

             }
   public String [] conectarConsultarDeimos(){
             //Craer array
             String[] datosDeimos = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlDeimos);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosDeimos[0] = resultados.getString("radio");
                    datosDeimos[1] = resultados.getString("id_planeta");
                    datosDeimos[2] = resultados.getString("nombre");
                    datosDeimos[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosDeimos;

             }
    public String [] conectarConsultarLuna(){
             //Craer array
             String[] datosLuna = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlLuna);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosLuna[0] = resultados.getString("radio");
                   datosLuna[1] = resultados.getString("id_planeta");
                    datosLuna[2] = resultados.getString("nombre");
                    datosLuna[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosLuna;

             }
    public String [] conectarConsultarIo(){
             //Craer array
             String[] datosIo = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlIo);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosIo[0] = resultados.getString("radio");
                  datosIo[1] = resultados.getString("id_planeta");
                    datosIo[2] = resultados.getString("nombre");
                   datosIo[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosIo;

             }
     public String [] conectarConsultarEuropa(){
             //Craer array
             String[] datosEuropa = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlEuropa);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosEuropa[0] = resultados.getString("radio");
                  datosEuropa[1] = resultados.getString("id_planeta");
                   datosEuropa[2] = resultados.getString("nombre");
                   datosEuropa[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosEuropa;

             }
      public String [] conectarConsultarGanimedes(){
             //Craer array
             String[] datosGanimedes = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlGanimedes);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosGanimedes[0] = resultados.getString("radio");
                 datosGanimedes[1] = resultados.getString("id_planeta");
                   datosGanimedes[2] = resultados.getString("nombre");
                   datosGanimedes[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosGanimedes;

             }
       public String [] conectarConsultarCalisto(){
             //Craer array
             String[] datosCalisto = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlCalisto);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosCalisto[0] = resultados.getString("radio");
                datosCalisto[1] = resultados.getString("id_planeta");
                   datosCalisto[2] = resultados.getString("nombre");
                   datosCalisto[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosCalisto;

             }
  public String [] conectarConsultarTitan(){
             //Craer array
             String[] datosTitan = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlTitan);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosTitan[0] = resultados.getString("radio");
                datosTitan[1] = resultados.getString("id_planeta");
                   datosTitan[2] = resultados.getString("nombre");
                  datosTitan[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosTitan;

             }
 public String [] conectarConsultarEncelado(){
             //Craer array
             String[] datosEncelado = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlEncelado);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosEncelado[0] = resultados.getString("radio");
                datosEncelado[1] = resultados.getString("id_planeta");
                   datosEncelado[2] = resultados.getString("nombre");
                  datosEncelado[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosEncelado;

             }
 public String [] conectarConsultarTitania(){
             //Craer array
             String[] datosTitania = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlTitania);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                    datosTitania[0] = resultados.getString("radio");
               datosTitania[1] = resultados.getString("id_planeta");
                   datosTitania[2] = resultados.getString("nombre");
                  datosTitania[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosTitania;

             }
  public String [] conectarConsultarOberon(){
             //Craer array
             String[] datosOberon = new String[7];
             try{
             //Conecto
             Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
             Statement statement = conexion.createStatement();
             //Lanzar
             ResultSet resultados = statement.executeQuery(sqlOberon);
                //Recoger datos y guardar en array
                while (resultados.next()) {
                   datosOberon[0] = resultados.getString("radio");
               datosOberon[1] = resultados.getString("id_planeta");
                   datosOberon[2] = resultados.getString("nombre");
                  datosOberon[3] = resultados.getString("masa");
                }
                

                //CIERRO
                resultados.close();
                conexion.close();
                statement.close();

             
             
             } catch (SQLException e) {
                e.printStackTrace();
            }
                             //DEVUELVO
                return datosOberon;

             }
}