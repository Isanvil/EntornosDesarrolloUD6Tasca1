import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpleadorBRTest {
    @Test
    public void testSalNetoEn2000Ei1640(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1640.00, e.calculaSalarioNeto(e.calculaSalarioBruto(TipoEmpleado.venedor, 1500, 40)));
    }

    @Test
    public void testSalNetoEn1500Ei1230(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1230, e.calculaSalarioNeto(e.calculaSalarioBruto(TipoEmpleado.encarregat, 0, 0)));
    }

    @Test
    public void  testSalNet1499_99Ei1259_9916(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1259.9916, e.calculaSalarioNeto(e.setSalarioNeto((float) 1499.99)), 0.01);
    }

    @Test
    public void testSal1250Ei1050(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1050, e.calculaSalarioNeto(e.setSalarioNeto((float) 1250)));
    }

    @Test
    public void testSalNeto_01(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(840, e.calculaSalarioNeto(e.setSalarioNeto((float) 1000)), 0.01);
    }

    // SEGONA TANDA
    @Test
    public void testSalNeto_02(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(999.99, e.calculaSalarioNeto(e.setSalarioNeto((float) 999.99)), 0.01);
    }

    @Test
    public void testSalNeto_03(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(500, e.calculaSalarioNeto(e.setSalarioNeto((float) 500)), 0.01);
    }

    @Test
    public void testSalNeto_04(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(0, e.calculaSalarioNeto(e.setSalarioNeto((float) 0)), 0.01);
    }

    @Test
    public void testSalNeto_05(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(-1, e.calculaSalarioNeto(e.setSalarioNeto((float) -1)), 0.01);
    }

    @Test
    public void testSAlBruto_01(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1360, e.calculaSalarioBruto(TipoEmpleado.venedor, 2000, 8));
    }

    //TRECERA TANDA
    @Test
    public void testSAlBruto_02(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1260, e.calculaSalarioBruto(TipoEmpleado.venedor, 1500, 3));
    }

    @Test
    public void testSAlBruto_03(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1100, e.calculaSalarioBruto(TipoEmpleado.venedor, 1499.99F, 0));
    }
    @Test
    public void testSAlBruto_04(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1760, e.calculaSalarioBruto(TipoEmpleado.encarregat, 1250, 8));
    }

    @Test
    public void testSalBruto_05(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1600, e.calculaSalarioBruto(TipoEmpleado.encarregat, 1000, 0));
    }

    @Test
    public void testSalBruto_06(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1560, e.calculaSalarioBruto(TipoEmpleado.encarregat, 999.99F, 3));
    }

    //QUARTA TANDA
    @Test
    public void testSalBruto_07(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1500, e.calculaSalarioBruto(TipoEmpleado.encarregat, 500, 0));
    }

    @Test
    public void testSalBruto_08(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(1660, e.calculaSalarioBruto(TipoEmpleado.encarregat, 0, 8));
    }

    @Test
    public void testSalBruto_09(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(-1, e.calculaSalarioBruto(TipoEmpleado.venedor, -1, 8));
    }

    @Test
    public void testSalBruto_10(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(-1, e.calculaSalarioBruto(TipoEmpleado.venedor, 1500, -1));
    }

    @Test
    public void testSalBrutp_11(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(-1, e.calculaSalarioBruto(null, 1500, 8));
    }
}