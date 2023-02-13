package com.directi.training.ocp.exercise;

public class SpaceSlot implements Ressource {
    int resourceId ;

    @Override
    public int allocate() {
        resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return 0;
    }

    @Override
    public int free() {
        return 0;
    }

    private void markSpaceSlotBusy(int resourceId)
    {
    }

    private int findFreeSpaceSlot()
    {
        return 0;
    }
}
