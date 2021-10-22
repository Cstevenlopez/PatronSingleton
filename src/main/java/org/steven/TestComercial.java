package org.steven;

public class TestComercial {
    public static void main(String[] args)
    {
        Comercial zonacoolcomercial= Comercial.Instance();
        zonacoolcomercial.setNombre("ZONACOOL");
        zonacoolcomercial.setDireccion("Colonea anexo a la primero de mayo");
        zonacoolcomercial.setEmail("Zonacoolmanagua@gmail.com");

        visualiza();
    }

    public static void visualiza()
    {
        Comercial zonacoolcomercial = Comercial.Instance();
        zonacoolcomercial.visualiza();
    }
}