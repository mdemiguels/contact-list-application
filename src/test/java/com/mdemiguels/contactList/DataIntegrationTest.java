package com.mdemiguels.contactList;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

@SpringBootTest
public class DataIntegrationTest {
    @Test
    @Sql("/data.sql")
    public void testDataLoading() {
        // Método de prueba vacío, los datos se cargarán desde data.sql automáticamente
    }
}
