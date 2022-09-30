public class Counter
{
    private int value;
    private int limit;
    public Counter()
    {
        value = 0;
    }

    public Counter(int count)
    {
        value = count;
    }
    public int getValue()
    {
        return value;
    }
    public void click()
    {
        value++;
        value = Math.min(value, limit);
    }
    public void reset()
    {
        value = 0;
    }

    public void undo()
    {
        value--;
        value = Math.max(value, 0);
    }

    public void setLimit(int maximum)
    {
        limit = maximum;
    }
}