ColorMatrix colorMatrix = new ColorMatrix();
float[] matrix = colorMatrix.getMatrix();

// Iterate over each row of the matrix and add the fifth column
for (int row = 0; row < 5; row++) {
    matrix[row * 5 + 4] += matrix[row * 5]; // Adding the fifth column value
}

colorMatrix.setMatrix(matrix);
