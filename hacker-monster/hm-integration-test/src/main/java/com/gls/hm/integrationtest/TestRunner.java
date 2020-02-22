package com.gls.hm.integrationtest;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.FilePrintStreamFactory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class TestRunner extends JUnitStories
{
	@Autowired
	private ApplicationContext applicationContext;

	@Override
	public Configuration configuration()
	{
		return new MostUsefulConfiguration()
				.useStoryReporterBuilder(new StoryReporterBuilder()
						.withDefaultFormats()
						.withPathResolver(new FilePrintStreamFactory.ResolveToPackagedName())
						.withFormats(Format.CONSOLE, Format.XML, Format.HTML)
						.withFailureTrace(true)
						.withFailureTraceCompression(false))
				.usePendingStepStrategy(new FailingUponPendingStep());
	}

	@Override
	public InjectableStepsFactory stepsFactory()
	{
		return new InstanceStepsFactory(configuration(), new TestStep());
	}

	@Override
	protected List<String> storyPaths()
	{
		return new StoryFinder().findPaths(CodeLocations.codeLocationFromClass(this.getClass()), "**/*.story", "**/excluded*.story");
	}
}