package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }
    //taking the array that's given and converting to stream
    // the Lambas is (FOREACH) loop
    //.filter (filter out anything less then the maxNumberDuplicates)
    //then converting back into a an array
    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter(y -> getOccurance(y) < maxNumberOfDuplications).toArray(String[] :: new);
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter(t -> getOccurance(t) != exactNumberOfDuplications).toArray(String[] :: new);

    }
    public Long getOccurance (String x){
        return Arrays.stream(array).filter(z -> z.equals(x)).count();
    }
}
