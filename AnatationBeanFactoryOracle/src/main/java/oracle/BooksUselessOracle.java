package oracle;

import org.springframework.stereotype.Service;

@Service("oracle")
public class BooksUselessOracle implements Oracle {
    @Override
    public String defineLifeMeaning() {
        return "Encyclopedias are а waste of money - use the Internet";
    }
}
