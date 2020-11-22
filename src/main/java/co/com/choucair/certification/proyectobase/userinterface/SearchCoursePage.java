package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {

    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("//div[@id='seleccion']//strong"));
    public static final Target INPUT_COURSE = Target.the("Prueba Técnica - Analista Bancolombia")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//a[text()[contains(.,'cnica - Analista Bancolombia')]]"));
    public static final Target NAME_COURSE = Target.the("Estrae el nombre del curso")
            .located(By.xpath("//h1[text()[contains(.,'cnica - Analista Bancolombia')]]"));


    /*
    ************************************************************************************************************
          * NOTA: En base a que el usuario asignado para la prueba no tiene acceso a 'Universidad Choucair'
          * ya que indica 'Usted no tiene permiso para ver esta lista de cursos.',
          * Se orienta la prueba de busqueda para ir 'Selección Choucair' y seleccionar
          * el curso habilitado llamado: 'Prueba Técnica - Analista Bancolombia'.
          * Se presentan inconvenientes para buscar el nombre del curso con tildes,
          * por tanto se implementa la busqueda de solo una parte del nombre del cursno.
    ************************************************************************************************************
    */
}
