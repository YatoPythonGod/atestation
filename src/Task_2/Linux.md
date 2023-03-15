## Задание 1

1. #### Используйте команды операционной системы Linux и создайте две новых директории – «Игрушки для школьников» и «Игрушки для дошколят»

```
mkdir atestation
cd atestation
mkdir toys_for_schoolchildren; mkdir toys_for_preschool_children
ll
```
```
drwxrwxr-x  2 sergey sergey 4096 มี.ค.  14 20:04 toys_for_preschool_children/
drwxrwxr-x  2 sergey sergey 4096 มี.ค.  14 20:04 toys_for_schoolchildren/ 
```


2. #### Создайте в директории «Игрушки для школьников» текстовые файлы - «Роботы», «Конструктор», «Настольные игры»

```
cd toys_for_schoolchildren

echo "Robots" > Robots

cat > Constructor
Constructor
^C

touch Board_games && nano Board_games
> Board_games

cat Board_games Constructor Robots
```
```
Board_games
Constructor
Robots
```


3. #### Создайте в директории «Игрушки для дошколят» текстовые файлы «Мягкие игрушки», «Куклы», «Машинки»

```
cd ../toys_for_preschool_children/

echo "Soft toys" > Soft_toys
echo "Dolls" > Dolls
echo "Cars" > Cars
```

4. #### Объединить 2 директории в одну «Имя Игрушки»

```
cd..

mkdir name_toy
mv toys_for_preschool_children/* name_toy/
mv toys_for_schoolchildren/* name_toy/
```

5. #### Переименовать директорию «Имя Игрушки» в «Игрушки»
```agsl
mv name_toy/ Toys/
```

6. #### Просмотреть содержимое каталога «Игрушки».

```
ll Toys
```
```
drwxrwxr-x 2 sergey sergey 4096 มี.ค.  14 20:42 ./
drwxrwxr-x 5 sergey sergey 4096 มี.ค.  14 20:44 ../
-rw-rw-r-- 1 sergey sergey   12 มี.ค.  14 20:25 Board_games
-rw-rw-r-- 1 sergey sergey    5 มี.ค.  14 20:36 Cars
-rw-rw-r-- 1 sergey sergey   12 มี.ค.  14 20:24 Constructor
-rw-rw-r-- 1 sergey sergey    6 มี.ค.  14 20:36 Dolls
-rw-rw-r-- 1 sergey sergey    7 มี.ค.  14 20:23 Robots
-rw-rw-r-- 1 sergey sergey   10 มี.ค.  14 20:35 Soft_toys
```

7. #### Установить и удалить snap-пакет. (Любой, какой хотите)

```agsl
sudo snap install slack
sudo snap remove slack

```

8. #### Добавить произвольную задачу для выполнения каждые 3 минуты (Например, запись в текстовый файл чего-то или копирование из каталога А в каталог Б).

```agsl
crontab -e
*/3 * * * *  echo "Cron" >> /home/sergey/atestation/cron
```