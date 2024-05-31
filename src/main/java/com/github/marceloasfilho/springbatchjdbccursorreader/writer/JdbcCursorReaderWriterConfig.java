package com.github.marceloasfilho.springbatchjdbccursorreader.writer;

import com.github.marceloasfilho.springbatchjdbccursorreader.entity.Cliente;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcCursorReaderWriterConfig {

    @Bean
    public ItemWriter<Cliente> jdbcCursorWriter() {
        return clientes -> clientes.forEach(System.out::println);
    }
}
