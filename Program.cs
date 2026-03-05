using System;

namespace Abstract_Factory
{
 
    // 1. INTERFACES / CLASES ABSTRACTAS
  
    public abstract class MaterialFactory
    {
        public abstract Guia CrearGuia();
        public abstract Examen CrearExamen();
    }

    public abstract class Guia
    {
        public abstract void Mostrar();
    }

    public abstract class Examen
    {
        public abstract void Aplicar();
    }


    // 2. FAMILIA 1: MODALIDAD PRESENCIAL
 
    public class GuiaImpresa : Guia
    {
        public override void Mostrar()
        {
            Console.WriteLine("Mostrando la guia impresa");
        }
    }

    public class ExamenEnPapel : Examen
    {
        public override void Aplicar()
        {
            Console.WriteLine("Se aplica examen en papel");
        }
    }

    public class MaterialPresencialFactory : MaterialFactory
    {
        public override Guia CrearGuia()
        {
            return new GuiaImpresa();
        }

        public override Examen CrearExamen()
        {
            return new ExamenEnPapel();
        }
    }

 
    // 3. FAMILIA 2: MODALIDAD VIRTUAL

    public class GuiaPDF : Guia
    {
        public override void Mostrar()
        {
            Console.WriteLine("Mostrando la guia PDF");
        }
    }

    public class ExamenOnline : Examen
    {
        public override void Aplicar()
        {
            Console.WriteLine("Se aplica examen en linea");
        }
    }

    public class MaterialVirtualFactory : MaterialFactory
    {
        public override Guia CrearGuia()
        {
            return new GuiaPDF();
        }

        public override Examen CrearExamen()
        {
            return new ExamenOnline();
        }
    }


    // 4. FAMILIA 3: MODALIDAD HÍBRIDA (NUEVA)

    public class GuiaHibrida : Guia
    {
        public override void Mostrar()
        {
            Console.WriteLine("Mostrando la Guía en Modalidad Híbrida (semipresencial)");
        }
    }

    public class ExamenMixto : Examen
    {
        public override void Aplicar()
        {
            Console.WriteLine("Se aplica Examen Mixto");
        }
    }

    public class MaterialHibridoFactory : MaterialFactory
    {
        public override Guia CrearGuia()
        {
            return new GuiaHibrida();
        }

        public override Examen CrearExamen()
        {
            return new ExamenMixto();
        }
    }


    // 5. CÓDIGO CLIENTE (PROGRAMA PRINCIPAL)

    internal class Program
    {
        static void Main(string[] args)
        {
            MaterialFactory fabrica;
            Guia guia;
            Examen examen;

            // --- Prueba Presencial ---
            fabrica = new MaterialPresencialFactory();
            guia = fabrica.CrearGuia();
            examen = fabrica.CrearExamen();
            guia.Mostrar();
            examen.Aplicar();
            Console.WriteLine("");

            // --- Prueba Virtual ---
            fabrica = new MaterialVirtualFactory();
            guia = fabrica.CrearGuia();
            examen = fabrica.CrearExamen();
            guia.Mostrar();
            examen.Aplicar();
            Console.WriteLine("");

            // --- Prueba Híbrida (Nueva) ---
            fabrica = new MaterialHibridoFactory();
            guia = fabrica.CrearGuia();
            examen = fabrica.CrearExamen();
            guia.Mostrar();
            examen.Aplicar();

            Console.ReadKey();
        }
    }
}
