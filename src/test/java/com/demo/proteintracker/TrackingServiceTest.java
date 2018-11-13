package com.demo.proteintracker;

import org.junit.*;

import org.assertj.core.api.Assertions.*;

public class TrackingServiceTest {

    private TrackingService uut;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Called before the class is initialized");
    }
    @Before
    public void setUp() throws Exception {
        uut = new TrackingService();
    }

    @Test
    public void newTrackingServiceTotalIsZero(){
        // Arrange
        int expected = 0;
        // Assert
        //Assert.assertThat(uut.getTotal()).as

    }
    @Test
    public void addProtein() {
    }

    @Test
    public void removeProtein() {
    }

    @Test
    public void getTotal() {
    }

    @Test
    public void isGoalMet() {
    }

    @Test
    public void getHistory() {
    }

    @After
    public void tearDown() throws Exception {
    }
}