package actions;

interface ExpeditionProbs
{
    float COMMODITY_PROB = 0.5F;
    float RESOURCE_PROB = 1.0F;
    float DISASTER_PROB = 0.25F;
}


public enum Expeditions implements ExpeditionProbs{

    COCHINEAL(COMMODITY_PROB),
    COTTON(COMMODITY_PROB),
    TOBACCO(COMMODITY_PROB),
    SPICES(COMMODITY_PROB),
    WOOD(RESOURCE_PROB),
    METAL(RESOURCE_PROB),
    MANPOWER(RESOURCE_PROB),
    GOLD(RESOURCE_PROB),
    SHIPWRECK(DISASTER_PROB),
    DISEASE(DISASTER_PROB)
    ;

    private float probability;

    private Expeditions(float probability)
    {
        this.probability = probability;
    }



}
