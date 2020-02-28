package main.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j // lombok - for log
@RequiredArgsConstructor // lombok - for constructor DI
@Configuration
public class SimpleJobConfiguration {
	private final JobBuilderFactory jobBuilderFactory;
	private final StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Job simpleJob() {
		return jobBuilderFactory.get("simpleJob")
				.start(simpleStep1())
				.build();
	}
	
	public Step simpleStep1() {
		return stepBuilderFactory.get("simpleStep1")
				.tasklet((contribution, chunkContext) -> {
					log.info(">>>> This is Step1");
					return RepeatStatus.FINISHED;
				})
				.build();
	}
}
