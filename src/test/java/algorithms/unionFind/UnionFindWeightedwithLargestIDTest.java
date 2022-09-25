package algorithms.unionFind;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class UnionFindWeightedwithLargestIDTest {

    UnionFindWeightedwithLargestID unionFD ;
    @BeforeEach
    void createAObjects(){

        unionFD = new UnionFindWeightedwithLargestID(10);
        unionFD.union(4,3);
        unionFD.union(6,4);
        unionFD.union(1,9);
        unionFD.union(2,1);
        unionFD.union(6,1);
    }
    @Test
    void connected() {
        log.warn("objects :"+unionFD.toString());
        assertTrue(unionFD.connected(6, 4));

    }

    @Test
    void union() {
    }

    @Test
    void root() {
    }

    @Test
    void find() {
    }
}