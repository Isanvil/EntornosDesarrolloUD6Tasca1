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
    public void testSalSal1000Ei840(){
        EmpleadorBR e = new EmpleadorBR();
        assertEquals(840, e.calculaSalarioNeto(e.setSalarioNeto((float) 1000)), 0.01);
    }
}