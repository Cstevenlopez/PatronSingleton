package org.steven;

public class TestComercial {
    public static void main(String[] args)
    {
        Comercial poxscomerci= Comercial.Instance();
        poxscomerci.setNombre("ZONACOOL");
        poxscomerci.setDireccion("Colonea anexo a la primero de mayo");
        poxscomerci.setEmail("Zonacoolmanagua@gmail.com");

        visualiza();
    }

    public static void visualiza()
    {
        Comercial poxscomerci = Comercial.Instance();
        poxscomerci.visualiza();
    }
}