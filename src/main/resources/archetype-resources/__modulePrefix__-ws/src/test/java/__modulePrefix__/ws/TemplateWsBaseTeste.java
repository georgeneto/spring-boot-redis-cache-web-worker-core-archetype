package ${groupId}.${modulePrefix}.ws;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

@RunWith(SpringJUnit4ClassRunner.class)
public abstract class TemplateWsBaseTeste {

    @Before
    public void setUp() {

        FixtureFactoryLoader.loadTemplates("${groupId}.${modulePrefix}.ws.template");
    }

}