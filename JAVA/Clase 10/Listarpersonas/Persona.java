package TercerSemestreee.Java.Leccion10.Listarpersonas;

public class Persona {
    private String nombre;
    private String tel;
    private String email;
    private int id;
    private static int numeroPersonas = 0;

    public Persona(){
        this.id = ++Persona.numeroPersonas;
    }

    public Persona(String nombre, String tel, String email){
        this();
        this.nombre = nombre;
        this.tel = tel; 
        this.email = email;
    }

    // getter and setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre +
        ", tel=" + tel +
        ", email=" + email +
        ", id=" + id + "]";
    }
    
}
