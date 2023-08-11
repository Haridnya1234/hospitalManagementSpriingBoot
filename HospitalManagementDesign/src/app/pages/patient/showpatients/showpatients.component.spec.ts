import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowpatientsComponent } from './showpatients.component';

describe('ShowpatientsComponent', () => {
  let component: ShowpatientsComponent;
  let fixture: ComponentFixture<ShowpatientsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ShowpatientsComponent]
    });
    fixture = TestBed.createComponent(ShowpatientsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
