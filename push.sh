git add .
echo  Enter commit message:
read string
git commit -m $string
git push origin master
