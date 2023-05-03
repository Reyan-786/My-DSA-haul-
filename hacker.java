int leftd=0;
    int rightd=0;
    int lefti=0;
    int leftj=0;
    int righti=0;
    int rightj=arr.size();
    while(lefti<arr.size() && leftj<arr.size()){
        leftd+=arr.get(lefti++).get(leftj++);
    }
    while(righti<arr.size() && rightj>=0){
        rightd+=arr.get(righti++).get(rightj--);
    }
    int ans=Math.abs(rightd-leftd);
    return ans ;
