// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package ch.dreamweb.domain;

import ch.dreamweb.domain.Statistic;
import ch.dreamweb.domain.StatisticDataOnDemand;
import ch.dreamweb.domain.StatisticIntegrationTest;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import java.util.List;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

privileged aspect StatisticIntegrationTest_Roo_IntegrationTest {
    
    declare @type: StatisticIntegrationTest: @RunWith(SpringJUnit4ClassRunner.class);
    
    declare @type: StatisticIntegrationTest: @ContextConfiguration(locations = "classpath:/META-INF/spring/applicationContext*.xml");
    
    declare @type: StatisticIntegrationTest: @Transactional;
    
    @Autowired
    StatisticDataOnDemand StatisticIntegrationTest.dod;
    
    private static final LocalServiceTestHelper StatisticIntegrationTest.helper = new LocalServiceTestHelper(new com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig());
    
    @BeforeClass
    public static void StatisticIntegrationTest.setUp() {
        helper.setUp();
    }
    
    @AfterClass
    public static void StatisticIntegrationTest.tearDown() {
        helper.tearDown();
    }
    
    @Test
    public void StatisticIntegrationTest.testCountStatistics() {
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", dod.getRandomStatistic());
        long count = Statistic.countStatistics();
        Assert.assertTrue("Counter for 'Statistic' incorrectly reported there were no entries", count > 0);
    }
    
    @Test
    public void StatisticIntegrationTest.testFindStatistic() {
        Statistic obj = dod.getRandomStatistic();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to provide an identifier", id);
        obj = Statistic.findStatistic(id);
        Assert.assertNotNull("Find method for 'Statistic' illegally returned null for id '" + id + "'", obj);
        Assert.assertEquals("Find method for 'Statistic' returned the incorrect identifier", id, obj.getId());
    }
    
    @Test
    public void StatisticIntegrationTest.testFindAllStatistics() {
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", dod.getRandomStatistic());
        long count = Statistic.countStatistics();
        Assert.assertTrue("Too expensive to perform a find all test for 'Statistic', as there are " + count + " entries; set the findAllMaximum to exceed this value or set findAll=false on the integration test annotation to disable the test", count < 250);
        List<Statistic> result = Statistic.findAllStatistics();
        Assert.assertNotNull("Find all method for 'Statistic' illegally returned null", result);
        Assert.assertTrue("Find all method for 'Statistic' failed to return any data", result.size() > 0);
    }
    
    @Test
    public void StatisticIntegrationTest.testFindStatisticEntries() {
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", dod.getRandomStatistic());
        long count = Statistic.countStatistics();
        if (count > 20) count = 20;
        int firstResult = 0;
        int maxResults = (int) count;
        List<Statistic> result = Statistic.findStatisticEntries(firstResult, maxResults);
        Assert.assertNotNull("Find entries method for 'Statistic' illegally returned null", result);
        Assert.assertEquals("Find entries method for 'Statistic' returned an incorrect number of entries", count, result.size());
    }
    
    @Test
    public void StatisticIntegrationTest.testFlush() {
        Statistic obj = dod.getRandomStatistic();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to provide an identifier", id);
        obj = Statistic.findStatistic(id);
        Assert.assertNotNull("Find method for 'Statistic' illegally returned null for id '" + id + "'", obj);
        boolean modified =  dod.modifyStatistic(obj);
        Integer currentVersion = obj.getVersion();
        obj.flush();
        Assert.assertTrue("Version for 'Statistic' failed to increment on flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void StatisticIntegrationTest.testMergeUpdate() {
        Statistic obj = dod.getRandomStatistic();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to provide an identifier", id);
        obj = Statistic.findStatistic(id);
        boolean modified =  dod.modifyStatistic(obj);
        Integer currentVersion = obj.getVersion();
        Statistic merged = obj.merge();
        obj.flush();
        Assert.assertEquals("Identifier of merged object not the same as identifier of original object", merged.getId(), id);
        Assert.assertTrue("Version for 'Statistic' failed to increment on merge and flush directive", (currentVersion != null && obj.getVersion() > currentVersion) || !modified);
    }
    
    @Test
    public void StatisticIntegrationTest.testPersist() {
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", dod.getRandomStatistic());
        Statistic obj = dod.getNewTransientStatistic(Integer.MAX_VALUE);
        Assert.assertNotNull("Data on demand for 'Statistic' failed to provide a new transient entity", obj);
        Assert.assertNull("Expected 'Statistic' identifier to be null", obj.getId());
        obj.persist();
        obj.flush();
        Assert.assertNotNull("Expected 'Statistic' identifier to no longer be null", obj.getId());
    }
    
    @Test
    @Transactional(propagation = Propagation.SUPPORTS)
    public void StatisticIntegrationTest.testRemove() {
        Statistic obj = dod.getRandomStatistic();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to initialize correctly", obj);
        Long id = obj.getId();
        Assert.assertNotNull("Data on demand for 'Statistic' failed to provide an identifier", id);
        obj = Statistic.findStatistic(id);
        obj.remove();
        obj.flush();
        Assert.assertNull("Failed to remove 'Statistic' with identifier '" + id + "'", Statistic.findStatistic(id));
    }
    
}
