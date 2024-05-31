package com.github.marceloasfilho.springbatchjdbccursorreader.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcCursorReaderJobConfig {

    @Bean
    public Job jdbcCursorReaderJob(Step jdbcCursorReaderStep,
                                   @Qualifier("batchJobRepository") JobRepository jobRepository) {
        return new JobBuilder("jdbcCursorReaderJob", jobRepository)
                .start(jdbcCursorReaderStep)
                .incrementer(new RunIdIncrementer())
                .build();
    }
}
