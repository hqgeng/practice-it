public boolean isMagicSquare(int[][] a) {
    if(a.length == 0)
        return true;
        
    int sum = 0;
    int len = a[0].length;
    
    for(int j = 0; j < a[0].length; j++)
        sum += a[0][j];
        
    for(int i = 1; i < a.length; i++) {
        if(a[i].length != len)
            return false;
            
        int rowSum = 0;
        
        for(int j = 0; j < a[i].length; j++)
            rowSum += a[i][j];
            
        if(rowSum != sum)
            return false;
    }
    
    for(int j = 0; j < a.length; j++) {
        int colSum = 0;
        
        for(int i = 0; i < a.length; i++)
            colSum += a[i][j];
            
        if(colSum != sum)
            return false;
    }
    
    int diag = 0;
    
    for(int i = 0; i < a.length; i++)
        diag += a[i][i];
        
    if(diag != sum)
        return false;
        
    diag = 0;
    
    for(int i = 0; i < a.length; i++)
        diag += a[a.length - i - 1][i];
        
    return diag == sum;
}
