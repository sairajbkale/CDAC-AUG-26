#include <iostream>
#include <string>

using namespace std;

class Entity{

private:

	string name;
	int health;
	int level;
	string type;

public:

	Entity& setName(const string& name){
		this->name = name;
		return *this;
	}

	Entity& setHealth(int health){
		this->health = health;
		return *this;
	}

	Entity& setLevel(int level){
		this->level = level;
		return *this;
	}

	Entity& setType(const string& type){
		this->type = type;
		return *this;
	}

	string getName() const{
		return this->name;
	}
	int getHealth() const{
		return this->health;
	}
	int getLevel() const{
		return this->level;
	}
	string getType() const{
		return this->type;
	}

	void displayInfo() const{
		cout<<"Name: "<<this->name<<endl;
		cout<<"Health: "<<this->health<<endl;
		cout<<"Level: "<<this->level<<endl;
		cout<<"Type: "<<this->type<<endl;
		cout<<endl<<endl;
	}

};


// Part B - Working with namespaces

namespace Physics {

	double clamp(double val, double min, double max){

		if(max < min)
			return 0;

		cout<<"Physics clamp executed"<<endl;

		if(val < min)
			return min;

		if(val > max)
			return max;

		return val;
	}

	double lerp(double a, double b, double t){

		cout<<"Physics lerp executed"<<endl;
		return a + t * (b-a);
	}
}


namespace GameMath {

	int clamp(int val, int min, int max){

		if(max < min)
			return 0;

		cout<<"GameMath clamp executed"<<endl;

		if(val < min)
			return min;

		if(val > max)
			return max;

		return val;
	}

	double lerp(double a, double b, double t){

		cout<<"GameMath lerp executed"<<endl;

		return a + t * (b-a);
	}
}


void populateCount(int& cnt1, int& cnt2, int& cnt3,
				   int& cnt4, int& cnt5, int& gridval){

	if(gridval == 0){

		cnt1++;
	}
	else if(gridval == 1){

		cnt2++;
	}
	else if(gridval == 2){

		cnt3++;
	}
	else if(gridval == 3){

		cnt4++;
	}
	else{

		cnt5++;
	}
}


// global variable
int level = 1;


// Bonus - Scope resolution and nested namespace

namespace Engine{

	namespace Audio{

		void playSound(string name){

			cout<<"Playing sound: "<<name<<endl;
		}
	}
}


int main() {

	// Part A - Entity and method chaining

	Entity player, enemy, item;

	player.setName("Aragorn").setHealth(100).setLevel(10).setType("Player");

	enemy.setName("Orc").setHealth(60).setLevel(5).setType("Enemy");

	item.setName("HealthPotion").setHealth(0).setLevel(1).setType("Item");


	player.displayInfo();

	enemy.displayInfo();

	item.displayInfo();


	// Part B - Namespace functions

	cout<<"Physics Clamp: ";
	cout<<Physics::clamp(30, 50, 100);
	cout<<endl;

	cout<<"Physics Lerp: ";
	cout<<Physics::lerp(3, 7, 64);
	cout<<endl<<endl;

	cout<<"GameMath Clamp: ";
	cout<<GameMath::clamp(-2, 50, 100);
	cout<<endl;

	cout<<"GameMath Lerp: ";
	cout<<GameMath::lerp(3, 66, 64);
	cout<<endl;


	{
		using namespace Physics;

		cout<<clamp(10, 20, 3000);
	}

	cout<<endl;


	{
		using namespace GameMath;

		cout<<clamp(8000, 20, 590);
	}

	cout<<endl;


	// Part C - Dynamic game map

	int R, C;

	R = 3;
	C = 4;

	int** grid = new int*[R];

	for(int i = 0; i < R; i++){

		grid[i] = new int[C];

		for(int j = 0; j < C; j++){

			grid[i][j] = (rand() % 5);
		}
	}


	cout<<"===== GAME MAP "<<R<<" * "<<C<<" ====="<<endl;

	int cnt1 = 0, cnt2 = 0, cnt3 = 0, cnt4 = 0, cnt5 = 0;


	for(int i = 0; i < R; i++){

		for(int j = 0; j < C; j++){

			populateCount(cnt1, cnt2, cnt3, cnt4, cnt5, grid[i][j]);

			cout<<grid[i][j]<<" ";
		}

		cout<<endl;
	}


	cout<<"Legend: 0=Grass 1=Water 2=Mountain 3=Forest 4=Dungeon"<<endl;

	cout<<endl;

	cout<<"Tile Count:"<<endl;

	cout<<"Grass : "<<cnt1<<endl;

	cout<<"Water : "<<cnt2<<endl;

	cout<<"Mountain : "<<cnt3<<endl;

	cout<<"Forest : "<<cnt4<<endl;

	cout<<"Dungeon : "<<cnt5<<endl;


	// Bonus - local variable hides the global variable

	int level = 10;

	cout<<"Global level: "<<::level<<endl;

	cout<<"Local level: "<<level<<endl;

	cout<<"Calling nested namespace function:"<<endl;

	cout<<endl;

	Engine::Audio::playSound("sword_clash");


	return 0;
}
