class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> arith;
        for(string s:tokens){
            if(s == "+" || s == "-" || s == "/" || s == "*"){
                int b = arith.top();
                arith.pop();
                int a = arith.top();
                arith.pop();
                if(s == "+"){
                    arith.push(a+b);
                }
                if(s == "-"){
                    arith.push(a-b);
                }
                if(s == "*"){
                    arith.push(a*b);
                }
                if(s == "/"){
                    arith.push(a/b);
                }

            }
            else{
            int a = stoi(s);
            arith.push(a);
            }
        }
        return arith.top();
    }
};
