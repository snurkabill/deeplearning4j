package org.deeplearning4j.linalg.api.complex;

import org.deeplearning4j.linalg.api.ndarray.INDArray;

/**
 * Complex numbers
 * @author Adam Gibson
 */
public interface IComplexNDArray extends INDArray {

    /**
     * Reverse division
     *
     * @param other the matrix to divide from
     * @return
     */
    @Override
    IComplexNDArray rdiv(INDArray other);

    /**
     * Reverse divsion (in place)
     *
     * @param other
     * @return
     */
    @Override
    IComplexNDArray rdivi(INDArray other);

    /**
     * Reverse division
     *
     * @param other  the matrix to subtract from
     * @param result the result ndarray
     * @return
     */
    @Override
    IComplexNDArray rdiv(INDArray other, INDArray result);

    /**
     * Reverse division (in-place)
     *
     * @param other  the other ndarray to subtract
     * @param result the result ndarray
     * @return the ndarray with the operation applied
     */
    @Override
    IComplexNDArray rdivi(INDArray other, INDArray result);

    /**
     * Reverse subtraction
     *
     * @param other  the matrix to subtract from
     * @param result the result ndarray
     * @return
     */
    @Override
    IComplexNDArray rsub(INDArray other, INDArray result);

    /**
     * @param other
     * @return
     */
    @Override
    IComplexNDArray rsub(INDArray other);

    /**
     * @param other
     * @return
     */
    @Override
    IComplexNDArray rsubi(INDArray other);

    /**
     * Reverse subtraction (in-place)
     *
     * @param other  the other ndarray to subtract
     * @param result the result ndarray
     * @return the ndarray with the operation applied
     */
    @Override
    IComplexNDArray rsubi(INDArray other, INDArray result);

    /**
     *  a Hermitian matrix is a square matrix with complex entries that is equal to its own conjugate transpose
     *
     * @return the hermitian of this ndarray
     */
    public IComplexNDArray hermitian();

    /**
     * Compute complex conj.
     */

    public IComplexNDArray conj();


    /**
     * Compute complex conj (in-place).
     */

    public IComplexNDArray conji();

    /**
     * Gets the real portion of this complex ndarray
     * @return the real portion of this complex ndarray
     */
    INDArray getReal();

    /**
     * Replicate and tile array to fill out to the given shape
     * @param shape the new shape of this ndarray
     * @return the shape to fill out to
     */
    @Override
    IComplexNDArray repmat(int[] shape);

    /**
     * Insert a row in to this array
     * Will throw an exception if this
     * ndarray is not a matrix
     * @param row the row insert into
     * @param toPut the row to insert
     * @return this
     */
    @Override
    IComplexNDArray putRow(int row,INDArray toPut);

    /**
     * Insert a column in to this array
     * Will throw an exception if this
     * ndarray is not a matrix
     * @param column the column to insert
     * @param toPut the array to put
     * @return this
     */
    @Override
    IComplexNDArray putColumn(int column,INDArray toPut);

    /**
     * Returns the element at the specified row/column
     * This will throw an exception if the
     * @param row the row of the element to return
     * @param column the row of the element to return

     * @return a scalar indarray of the element at this index
     */
    @Override
    IComplexNDArray getScalar(int row,int column);

    /**
     * Returns the element at the specified index
     * @param i the index of the element to return
     * @return a scalar ndarray of the element at this index
     */
    @Override
    IComplexNDArray getScalar(int i);



    /**
     * Inserts the element at the specified index
     * @param i the index insert into
     * @param element a scalar ndarray
     * @return a scalar ndarray of the element at this index
     */
    @Override
    IComplexNDArray put(int i,INDArray element);


    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray diviColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray divColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray diviRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray divRowVector(INDArray rowVector);


    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray muliColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray mulColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray muliRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray mulRowVector(INDArray rowVector);




    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray subiColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray subColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray subiRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray subRowVector(INDArray rowVector);

    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray addiColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray addColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray addiRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray addRowVector(INDArray rowVector);

    /**
     * Perform a copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @return the result of the matrix multiplication
     */
    @Override
    IComplexNDArray mmul(INDArray other);


    /**
     * Perform an copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @param result the result ndarray
     * @return the result of the matrix multiplication
     */
    @Override
    IComplexNDArray mmul(INDArray other,INDArray result);


    /**
     * in place (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @return the result of the divide
     */
    @Override
    IComplexNDArray div(INDArray other);

    /**
     * copy (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @param result the result ndarray
     * @return the result of the divide
     */
    @Override
    IComplexNDArray div(INDArray other,INDArray result);


    /**
     * copy (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @return the result of the addition
     */
    @Override
    IComplexNDArray mul(INDArray other);

    /**
     * copy (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @param result the result ndarray
     * @return the result of the multiplication
     */
    @Override
    IComplexNDArray mul(INDArray other,INDArray result);

    /**
     * copy subtraction of two matrices
     * @param other the second ndarray to subtract
     * @return the result of the addition
     */
    @Override
    IComplexNDArray sub(INDArray other);

    /**
     * copy subtraction of two matrices
     * @param other the second ndarray to subtract
     * @param result the result ndarray
     * @return the result of the subtraction
     */
    @Override
    IComplexNDArray sub(INDArray other,INDArray result);

    /**
     * copy addition of two matrices
     * @param other the second ndarray to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray add(INDArray other);

    /**
     * copy addition of two matrices
     * @param other the second ndarray to add
     * @param result the result ndarray
     * @return the result of the addition
     */
    @Override
    IComplexNDArray add(INDArray other,INDArray result);




    /**
     * Perform an copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @return the result of the matrix multiplication
     */
    @Override
    IComplexNDArray mmuli(INDArray other);


    /**
     * Perform an copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @param result the result ndarray
     * @return the result of the matrix multiplication
     */
    @Override
    IComplexNDArray mmuli(INDArray other,INDArray result);


    /**
     * in place (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @return the result of the divide
     */
    @Override
    IComplexNDArray divi(INDArray other);

    /**
     * in place (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @param result the result ndarray
     * @return the result of the divide
     */
    @Override
    IComplexNDArray divi(INDArray other,INDArray result);


    /**
     * in place (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @return the result of the addition
     */
    @Override
    IComplexNDArray muli(INDArray other);

    /**
     * in place (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @param result the result ndarray
     * @return the result of the multiplication
     */
    @Override
    IComplexNDArray muli(INDArray other,INDArray result);

    /**
     * in place subtraction of two matrices
     * @param other the second ndarray to subtract
     * @return the result of the addition
     */
    IComplexNDArray subi(INDArray other);

    /**
     * in place subtraction of two matrices
     * @param other the second ndarray to subtract
     * @param result the result ndarray
     * @return the result of the subtraction
     */
    @Override
    IComplexNDArray subi(INDArray other,INDArray result);

    /**
     * in place addition of two matrices
     * @param other the second ndarray to add
     * @return the result of the addition
     */
    @Override
    IComplexNDArray addi(INDArray other);

    /**
     * in place addition of two matrices
     * @param other the second ndarray to add
     * @param result the result ndarray
     * @return the result of the addition
     */
    @Override
    IComplexNDArray addi(INDArray other,INDArray result);


    /**
     * Returns the normmax along the specified dimension
     * @param dimension  the dimension to getScalar the norm1 along
     * @return the norm1 along the specified dimension
     */
    @Override
    IComplexNDArray normmax(int dimension);




    /**
     * Returns the norm2 along the specified dimension
     * @param dimension  the dimension to getScalar the norm2 along
     * @return the norm2 along the specified dimension
     */
    @Override
    IComplexNDArray norm2(int dimension);


    /**
     * Returns the norm1 along the specified dimension
     * @param dimension  the dimension to getScalar the norm1 along
     * @return the norm1 along the specified dimension
     */
    @Override
    IComplexNDArray norm1(int dimension);



    /**
     * Returns the product along a given dimension
     * @param dimension the dimension to getScalar the product along
     * @return the product along the specified dimension
     */
    @Override
    IComplexNDArray prod(int dimension);


    /**
     * Returns the overall mean of this ndarray
     * @param dimension the dimension to getScalar the mean along
     * @return the mean along the specified dimension of this ndarray
     */
    @Override
    IComplexNDArray mean(int dimension);

    /**
     * Returns the sum along the last dimension of this ndarray
     * @param dimension  the dimension to getScalar the sum along
     * @return the sum along the specified dimension of this ndarray
     */
    @Override
    IComplexNDArray sum(int dimension);





    /**
     * Returns the elements at the the specified indices
     * @param indices the indices to getScalar
     * @return the array with the specified elements
     */
    @Override
    IComplexNDArray get(int[] indices);


    /**
     * Return a copy of this ndarray
     * @return a copy of this ndarray
     */
    @Override
    IComplexNDArray dup();


    /**
     * Returns a flattened version (row vector) of this ndarray
     * @return a flattened version (row vector) of this ndarray
     */
    @Override
    IComplexNDArray ravel();




    /**
     * Returns the specified slice of this ndarray
     * @param i the index of the slice to return
     * @param dimension the dimension to return the slice for
     * @return the specified slice of this ndarray
     */
    IComplexNDArray slice(int i,int dimension);


    /**
     * Returns the specified slice of this ndarray
     * @param i the index of the slice to return
     * @return the specified slice of this ndarray
     */
    IComplexNDArray slice(int i);



    /**
     * Reshapes the ndarray (can't change the length of the ndarray)
     * @param newShape the new shape of the ndarray
     * @return the reshaped ndarray
     */
    @Override
    IComplexNDArray reshape(int[] newShape);

    /**
     * Flip the rows and columns of a matrix
     * @return the flipped rows and columns of a matrix
     */
    @Override
    IComplexNDArray transpose();

    /**
     * Mainly here for people coming from numpy.
     * This is equivalent to a call to permute
     * @param dimension the dimension to swap
     * @param with the one to swap it with
     * @return the swapped axes view
     */
    @Override
    IComplexNDArray swapAxes(int dimension,int with);

    /**
     * See: http://www.mathworks.com/help/matlab/ref/permute.html
     * @param rearrange the dimensions to swap to
     * @return the newly permuted array
     */
    @Override
    IComplexNDArray permute(int[] rearrange);


    /**
     * Returns the specified column.
     * Throws an exception if its not a matrix
     * @param i the column to getScalar
     * @return the specified column
     */
    @Override
    IComplexNDArray getColumn(int i);

    /**
     * Returns the specified row.
     * Throws an exception if its not a matrix
     * @param i the row to getScalar
     * @return the specified row
     */
    @Override
    IComplexNDArray getRow(int i);






    /**
     * Broadcasts this ndarray to be the specified shape
     * @param shape the new shape of this ndarray
     * @return the broadcasted ndarray
     */
    @Override
    IComplexNDArray broadcast(int[] shape);

    /**
     * Broadcasts this ndarray to be the specified shape
     * @param shape the new shape of this ndarray
     * @return the broadcasted ndarray
     */
    @Override
    IComplexNDArray broadcasti(int[] shape);



}