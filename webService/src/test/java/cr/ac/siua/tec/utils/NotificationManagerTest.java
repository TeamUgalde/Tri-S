package cr.ac.siua.tec.utils;

import org.junit.Test;

import java.util.Map;

import static cr.ac.siua.tec.utils.NotificationManager.getInvalidFormMsg;
import static cr.ac.siua.tec.utils.NotificationManager.getValidFormMsg;
import static org.junit.Assert.*;

public class NotificationManagerTest {

    @Test
    public void testGetValidFormMsg() throws Exception {
        Map<String, String> result = getValidFormMsg();
        assertEquals(result.get("type"), "success");
        assertEquals(result.get("msg"), "El formulario ha sido enviado exitosamente. Se envió un correo a su cuenta.");
    }

    @Test
    public void testGetInvalidFormMsg() throws Exception {
        Map<String, String> result = getInvalidFormMsg();
        assertEquals(result.get("type"), "error");
        assertEquals(result.get("msg"), "Error al procesar el formulario. Revise los campos llenados.");
    }
}