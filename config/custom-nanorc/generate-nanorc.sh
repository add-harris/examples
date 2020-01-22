FILE=~/.nanorc

if test -f "$FILE"
then

  declare -a YESS=("y" "yes" "ok" "yass" "si")
  EXIT=true

  echo "this script will remove the existing .nanorc, continue? (answer: ${YESS[@]} )"

  read input

  for yes in "${YESS[@]}"
    do
      if [ "$input" == "$yes" ]
	then
	  echo "very well... MWHAHAHAHA-HAAAAA"
	  EXIT=false
	  break
      fi
    done

  if [ "$EXIT" == true ]
  then
    echo "answered not yes - leaving script"
    exit
  else
    echo "deleting file $FILE"
    rm $FILE
  fi

fi

echo "writting new file $FILE"

# from nanorc collection
echo "# nanorc - [https://github.com/scopatz/nanorc]" >> $FILE

NANORCS=(~/.nano/custom-nanorc/nanorc/*.nanorc)

for i in "${NANORCS[@]}"
  do
    echo "include $i" >> $FILE
  done


echo "\n" >> $FILE

# from nano-highlights collection
echo "# nano-highlight - [https://github.com/serialhex/nano-highlight]" >> $FILE

NANO_HIGHLIGHTS=(~/.nano/custom-nanorc/nano-highlights/*.nanorc)

for i in "${NANO_HIGHLIGHTS[@]}"
  do
    echo "include $i" >> $FILE
  done

echo "write complete"

cat $FILE
